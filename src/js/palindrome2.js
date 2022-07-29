function solution(s){
    let reg = /[`~!@#$%^&*()_|+\-=?;:'",.<>\{\}\[\]\\\/ ]/gim;
    let t = s.replace(reg,'').toLowerCase();
    let len = t.length;

    if(len%2 !== 0) return "NO";
    for(i=0; i<Math.floor(len/2); i++){
        if(t[i] !== t[len-1-i]) return "NO";
    }
    return "YES";
  }
  
  let str="found7, time: study; Yduts; emit, 7Dnuof";
  console.log(solution(str));