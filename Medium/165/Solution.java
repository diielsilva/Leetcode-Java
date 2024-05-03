
public class Solution {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int ans = 0;
        int aux01 = 0;
        int aux02 = 0;

        if (v1.length > v2.length) {

            for (int i = 0; i < v2.length; i++) {
                int a1 = Integer.parseInt(v1[i]);
                int a2 = Integer.parseInt(v2[i]);

                aux01 += a1;
                aux02 += a2;

                if (aux01 != aux02) {
                    break;
                }
            }

            if (aux01 == aux02) {

                for (int i = v2.length; i < v1.length; i++) {
                    int a1 = Integer.parseInt(v1[i]);
                    aux01 += a1;

                    if (aux01 != aux02) {
                        break;
                    }
                }
            }

        } else if (v2.length > v1.length) {

            for (int i = 0; i < v1.length; i++) {
                int a1 = Integer.parseInt(v1[i]);
                int a2 = Integer.parseInt(v2[i]);

                aux01 += a1;
                aux02 += a2;

                if (aux01 != aux02) {
                    break;
                }

            }

            if (aux01 == aux02) {

                for (int i = v1.length; i < v2.length; i++) {
                    int a2 = Integer.parseInt(v2[i]);

                    aux02 += a2;

                    if (aux01 != aux02) {
                        break;
                    }

                }

            }

        } else {

            for (int i = 0; i < v1.length; i++) {
                int a1 = Integer.parseInt(v1[i]);
                int a2 = Integer.parseInt(v2[i]);

                aux01 += a1;
                aux02 += a2;

                if (aux01 != aux02) {
                    break;
                }
            }

        }

        if (aux02 > aux01) {
            ans = -1;
        } else if (aux01 > aux02) {
            ans = 1;
        }

        return ans;
    }

}
