public static String getSiblingGender(String a, int gen) {
    if(gen <= 0) return a;
    StringBuilder ans = new StringBuilder();
    for(int i = 0; i < a.length(); i++){
        ans.append(a.charAt(i));
    }
    for(int i = 0; i < a.length(); i++){
        if(a.charAt(i) == '0'){
            ans.append('1');
        }
        else{
            ans.append('0');
        }
    }
    gen--;
    return getSiblingGender(ans.toString(), gen);
}

public static char kthChildNthGeneration(int n, long k) {
    String a = getSiblingGender("0", n);
    if(k < a.length()){
        return a.charAt((int)k);
    }
    // Add error handling for when k is out of bounds.
}
//my solution incomplete and weird approach

