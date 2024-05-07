class sorted{
    public static void main(String[] args){
        sorted s=new sorted();
        int[] arr={1,2,3,6,5};
        System.out.println(s.chksort(arr,0));
    }
    public boolean chksort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && chksort(arr,index+1);
            
    }
}