#include<stdlib.h>
#include<stdio.h>
int main(){
	system("chcp 1251");
	int a = 0,b = 0;
	printf("\a Введите год вашего рождения:\n");
	scanf("%d",&a);
	if (a < 0) {
		printf("\a Вы родились до нашей эры.\n");
		goto end;
		}
	if (a == 0) {
		printf("\a Не верный ввод данных.\n");
		goto end;
	}
	if (a > 2017) {
		printf("\a Вы еще не родились.\n");
		goto end;
	}
	b = 2017 - a;

	if ((b%10 == 0) || (b%100 > 10) && (b%100 < 20) || ((b%10 > 4) && (b%10 < 10))) {
		printf("\a Вам %d лет.\n", b);
		goto end;
	}
	if (b%10 == 1) {
		printf("\a Вам %d год.\n", b);
		goto end;
	}
	printf("\a Вам %d года.\n", b);
	system("pause");
	end:;
	}
