# include<stdio.h>
void tower(int,char,char,char);
int main(){
    int num;
    printf("enter no of disk");
    scanf("%d",&num);
    printf("the sequence of moves involve in the tower of henoi are \n");
    tower(num,'A','C','B');
    return 0;
}
    void tower(int num,char frontp,char topp,char auxp)
    {
        if(num==1){
            printf("\n move disc 1 from tower %c to tower %c", frontp ,topp);
            return ;
        }
        tower(num-1,frontp,auxp,topp);
        printf("\n move disc %d from tower %c to tower %c ",num, frontp,topp);
        tower(num-1,auxp,topp,frontp);
    }
