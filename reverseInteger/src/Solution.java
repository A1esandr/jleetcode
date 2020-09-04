public class Solution {
    public int reverse(int x) {
        boolean positive = true;
        if (x < 0) {
            positive = false;
        }
        Integer xi = new Integer(x);
        String xs = xi.toString();
        String[] xss = xs.split("");
        StringBuilder sb = new StringBuilder();
        if(!positive){
            sb.append("-");
        }
        for(int i = xss.length - 1; i > -1; i--){
            if (i == 0 && !positive){
                break;
            }
            sb.append(xss[i]);
        }
        String rev = sb.toString();
        int result = 0;
        try {
            result = Integer.parseInt(rev);
        } catch (Exception e) {

        }
        return result;
    }
}
