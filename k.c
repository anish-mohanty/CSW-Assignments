#include<stdio.h>
#include<math.h>

int main()
{
	int a,b,n;
	
	printf("CALCULATOR\n");
	printf(" 1 - Addition\n");
	printf(" 2 - Substraction\n");
	printf(" 3 - Division\n");
	printf(" 4 - Multiplication\n");
	printf(" 5 - Mod\n");
	printf(" 6 - Power off\n");
	printf(" 7 - Sqrt\n");
	printf(" 8 - Cube root\n");
	printf(" 9 - sin()\n");
	printf(" 10 - cos()\n");
	printf("Enter the operation to be done: ");
	scanf("%d",&n);
	
	
	switch(n)
	{
		case 1:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%d\n",a+b);
			break;
		case 2:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%d\n", a-b);
			break;
		case 3:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%d\n",a/b);
			break;
		case 4:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%d\n",a*b);
			break;
		case 5:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%d\n",a%b);
			break;
		case 6:
			printf("Enter both numbers: ");
			scanf("%d%d",&a,&b);
			printf("%.3f\n",pow(a,b));
			break;
		case 7:
			printf("Enter the number: ");
			scanf("%d",&a);
			printf("%.3f\n",sqrt(a));
			break;
		case 8:
			printf("Enter the number: ");
			scanf("%d",&a);
			printf("%.3f\n",pow(a,0.33));
			break;
		case 9:
			printf("Enter the number: ");
			scanf("%d",&a);
			printf("%.3f\n",sin(a*(3.14/180)));
			break;
		case 10:
			printf("Enter the number: ");
			scanf("%d",&a);
			printf("%.3f\n",cos(a*(3.14/180)));
			break;
		default:
			printf("Invalid Input");

	}
	
	return 0;
	
}
