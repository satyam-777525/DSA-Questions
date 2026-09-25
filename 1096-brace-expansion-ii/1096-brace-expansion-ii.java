// unsolved list
class Solution {

    public List<String> braceExpansionII(String expression) {

        int[] index = {0};

        Set<String> set = helper(expression, index);

        List<String> ans = new ArrayList<>(set);

        Collections.sort(ans);

        return ans;
    }

    Set<String> helper(String s, int[] index) {

        // result = comma-separated alternatives
        Set<String> result = new HashSet<>();

        // current = current concatenated part
        Set<String> current = new HashSet<>();
        current.add("");

        while (index[0] < s.length() && s.charAt(index[0]) != '}') {

            char ch = s.charAt(index[0]);

            // CASE 1: comma
            if (ch == ',') {

                // Current alternative complete
                result.addAll(current);

                // New alternative start
                current.clear();
                current.add("");

                index[0]++;
            }

            // CASE 2: opening brace
            else if (ch == '{') {

                // Skip '{'
                index[0]++;

                // Solve inside braces
                Set<String> inside = helper(s, index);

                // Skip '}'
                index[0]++;

                // Concatenate current with inside
                current = combine(current, inside);
            }

            // CASE 3: normal character
            else {

                Set<String> temp = new HashSet<>();

                for (String str : current) {
                    temp.add(str + ch);
                }

                current = temp;

                index[0]++;
            }
        }

        // Add last alternative
        result.addAll(current);

        return result;
    }

    // Cartesian product / concatenation
    Set<String> combine(Set<String> a, Set<String> b) {

        Set<String> result = new HashSet<>();

        for (String x : a) {

            for (String y : b) {

                result.add(x + y);
            }
        }

        return result;
    }
}