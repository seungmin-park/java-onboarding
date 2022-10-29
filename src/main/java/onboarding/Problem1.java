package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if(!validData(pobi, crong)) return -1;

        return answer;
    }

    private static boolean validData(List<Integer> pobi, List<Integer> crong) {
        if (pobi.get(0) < 1 || crong.get(0) < 1 || pobi.get(1) > 400 || crong.get(1) > 400) return false;
        if (pobi.get(0) %2 != 1 || crong.get(0) %2 != 1 || pobi.get(1) %2 != 0 || crong.get(1) %2 != 0) return false;
        if (pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1) return false;
        return true;
    }
}