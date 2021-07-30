

class StringHashing{

    private long P = 31;
    private long M = 1e9+7;
    const long N = 1e6;

    long []fxp;

    StringHashing(){
        fxp = new long [N];
        fxp[0] = 1;
        for(i = 1; i<N; i++){
            /*
                fxp[i] = P^i % M
                fxp[i-1] = P^(i-1) % M;
                fxp[i] = (P^(i-1) * P)%M = (P^(i-1) % M * P%M) % M (Using (a*b)%m)
                fxp[i] = (fxp[i-1] * P) % M;
            */

            fxp[i] = (fxp[i-1] * P) % M;
        }
    }


    long getHash(String s){
        /*
            Hashvalue of string s
            (s[0] * P^0 + s[1] * P^1 + s[2] * P^2 + s[3] * P^3 +...+s[n-1] * P^(n-1))%M
        */

        long hashval = 0;
        for(int i=0;i<s.length;i++){
            long ascii = (s.charAt(i) - 'a') + 1L;
            hashval = (hashval + (ascii * fxp[i])%M) % M;
        }

        return hashval;
    }
}


/*
    M = 35
    hashval = 33
    x = 32
    hashval += 32  ===> 33+32 = 65
*/