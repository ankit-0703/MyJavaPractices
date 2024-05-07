class sortedLIst{
    public int list(int arr[],target,index,ArrayList<integer>List){
        if(index==arr.length-1){
            return 0;
        }
        if(arr[index]==target){
            List.add[index];
        }
        list(arr,target,index+1,List);
    }
}