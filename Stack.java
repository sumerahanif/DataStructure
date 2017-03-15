Public class Stack{

Public static void main(String[].args)
{
int ch,Size,Stack[],item;
top=-1;
Scanner input=new Scanner(system.in);
System.out.println("Enter Size of Stack:");
Size=input.nextint();
Stack[Size];
System.out.println(enter choice:");
ch=input.nextint();
Switch(ch)
{
case:1 push();
break;
case:2 pop();
break;
default:
System.out.println("Invalid choice");
}
public void push()
{

if(top==size-1)
{
System.out.println("Stack full");
}
else
{
top++;
stack[top]=item;
return;
}
}
public void pop()
{

if(top==-1)
{
System.out.println("Stack empty");
}
else
{
item=stack[top];
System.out.println("Poped element is:"+item);
top--;
}
}
}
}
