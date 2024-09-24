public class merge{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int arr3[]=new int[arr1.length+arr2.length];int i=0;int k=0;
        for(i=0;i<arr1.length;i++){
            arr3[k]=arr1[i];
            k++;
        }
        for(int j=0;j<arr2.length;j++){
            arr3[k]=arr2[j];
            k++;
        }
        for(int m=1;m<arr3.length;m++){
            for(int n=0;n<arr3.length-m;n++){
                if(arr3[n]>arr3[n+1]){
                    int temp=arr3[n];
                    arr3[n]=arr3[n+1];
                    arr3[n+1]=temp;
                }
            }
        }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
    }
}
