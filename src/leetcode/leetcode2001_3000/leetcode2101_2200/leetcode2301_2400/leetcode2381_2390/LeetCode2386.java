package leetcode.leetcode2001_3000.leetcode2101_2200.leetcode2301_2400.leetcode2381_2390;

public class LeetCode2386 {

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result=0;
        for(int i=0;i<energy.length;i++){
            if(initialEnergy>energy[i]){
                if(initialExperience<=experience[i]){
                    result+=experience[i]-initialExperience+1;
                    initialExperience=experience[i]+1;
                }
                initialEnergy=initialEnergy-energy[i];
                initialExperience+=experience[i];
            }else
            {
                result+=energy[i]-initialEnergy+1;
                initialEnergy=1;
                if(initialExperience<=experience[i]){
                    result+=experience[i]-initialExperience+1;
                    initialExperience=experience[i]+1;
                } initialExperience+=experience[i];
            }
        }
        return result;
    }




}
