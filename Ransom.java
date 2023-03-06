class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int res=-1;
     for (int i=0;i<ransomNote.length();i++)
     {
         char r = ransomNote.charAt(i);
         int matching_ind=-1;
         for (int j=0;j<magazine.length();j++) 
         {
             char m = magazine.charAt(j);
             if(m==r)
             {
                matching_ind=j;
             }
         }
         res= matching_ind;
     }
     if(res==-1) 
     return false ;
     return true;

    }
}
