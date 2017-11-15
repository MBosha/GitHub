//import * as strings from './strings';

// BEGIN (write your solution here)
function addDigits (num)
{
  const Sum = (numb) =>
  {
    console.log (numb + ' строка переданная в sum');
    let Result = 0;
    let Char = numb.toString();
    let len = Char.length;
    for (let i = 0; i < len; i++)
    {
      Result = Result + Number (numb [i]);
      console.log ('цикл sum i=' + i + ' Result=' + Result );
    }
    Result = Result.toString();
    return Result;
  };  
  let Char = num.toString();
  let w = true;
  let len;
  while (w)
  {
    len = Char.length;
    console.log (len + ' длина строки');
    if (len === 1)
    {
      result = Char;
      w = false;
    }
    if (len >1) 
    {
      Char = Sum (Char);
    }
    console.log (Char);
  }
  Char = Number (Char);
  console.log (typeof(Char));
  return Char;
}
// END
addDigits (1234567890);