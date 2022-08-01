function solution(str){
    let reg = /[^0-9]/g;
    let a = str.replace(reg, '');
    let sum = 0;
    for(i=0; i<a.length;i++){
        sum += Number(a[i]);
    }
    return sum;
}

let str="g0en2T05s8eSoft2";
console.log(solution(str));