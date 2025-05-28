package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class App {

    private void solve(int ind, List<Integer>ds,List<List<Integer>>ans,int[] candidates,int target){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(ind>=candidates.length){
            return;
        }
        if(target-candidates[ind]>=0){
            ds.add(candidates[ind]);
            solve(ind, ds, ans, candidates, target-candidates[ind]);
            ds.remove(ds.size()-1);
        }
        solve(ind+1,ds,ans,candidates,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(0, ds, ans, candidates, target);
        return ans;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{2,3,6,7};
        System.out.println();
    }
}
