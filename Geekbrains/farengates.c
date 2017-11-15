# include <stdio.h>

int main() {
  /* code */
  int fahr, celsius;
  int lower, upper, step;
  int i;
  lower = 0;
  upper = 300;
  step = 20;

  fahr = lower;

  for (i = lower; i <= upper; i = i + step) {
    /* code */
    celsius = 5 * (fahr - 32) / 9;
    printf ("%d : %d\n" , fahr, celsius);
  }

  while (fahr <= upper) {
    celsius = 5 * (fahr - 32) / 9;
    printf ("%d : %d\n" , fahr, celsius);
    fahr = fahr + step;
  }

  //return 0;
}

int main() {
  float km, miles, lower, upper, step;

  lower = 0;
  upper = 300;
  step = 20;

  km = lower;

  while (km <= upper) {
    miles = km * 0.621;
    printf ("%3.2f : %3.2f\n" , km, miles);
    km = km + step;
  }
}

# include <stdio.h>
int power (int, int);

main ()
{
  printf ("%d\n", power (2, 10));
  return 0;
}

int power (int base, int n)
{
  int i, p;
  p = 1;
  for (i=1; i <= n; ++i)
  {
    p = p * base;
  }
  return p;
  }
