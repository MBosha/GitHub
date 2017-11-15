import * as strings from './strings';

// BEGIN (write your solution here)
//let newStr = "";
const reverseInt = (num) =>
{
    str = num.toString ();
    //console.log(1, str, newStr, str.length);

    newStr = newStr + str[str.length - 1];
    //console.log(2, str, newStr, str.length);

    str = str.substr(0, (str.length-1));
    //console.log(3, str, newStr, str.length);

    //str = str.toInt();
    //console.log("");

    if ((str.length) === 0) {
      return newStr;
    }
    return reverseInt (str);
};
export default reverseInt;

// END

let newStr = "";
let str = "";

//console.log(i, str, newStr, "длина");
function reverseInt (num)
{
    str = num.toString ();
    console.log(1, str, newStr, str.length);

    newStr = newStr + str[str.length - 1];
    console.log(2, str, newStr, str.length);

    str = str.substr(0, (str.length-1));
    console.log(3, str, newStr, str.length);

    console.log("");

    if ((str.length) === 0) {
      return newStr;
    }
    return reverseInt (str);
}

reverseInt (-1234567890); 
