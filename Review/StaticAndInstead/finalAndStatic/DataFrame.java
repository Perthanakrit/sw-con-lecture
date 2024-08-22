package Q2.sec1;
public class DataFrame {
    private int nrow;
    private int ncol;

    private DataFrame(int nrow, int ncol){
        this.nrow = nrow;
        this.ncol = ncol;
    }

    DataFrame genDf(){
        return new DataFrame(1, 1);
        // return this(1,1);
    }

    DataFrame genDf(int nrow, int ncol){
        return new DataFrame(nrow, ncol);
    }

    DataFrame genDf(int n){
        return new DataFrame(n, n);
    }

    Object genDf(short nrow, short ncol){
        return new DataFrame(nrow, ncol);
    }

    Object genDf(short nrow){
        return new DataFrame(nrow, nrow);
    }


    // public DataFrame genDf(int n, int c){
    //     return new DataFrame(n, c);
    // }

    public static DataFrame genDf(short n, int c){
        return new DataFrame(n, c);
    }
}
