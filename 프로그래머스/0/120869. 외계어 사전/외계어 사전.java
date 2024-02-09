class Solution {
    public int solution(String[] spell, String[] dic) {
        
        // dic를 돌며, dic i번째 길이가 spell 길이랑 같으면 true
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].length() == spell.length) {
                boolean flag = true;
                // spell을 돌며 spell j번째를 포함하지 않으면 false
                for(int j=0; j < spell.length; j++) {
                    if(!dic[i].contains(spell[j])) {
                        flag = false;
                        break;
                    }
                }
                if(flag) return 1;
            }
        }
        return 2;
    }
}