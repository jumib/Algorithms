function solution(s){
    let cnt = 1
    let tmp = '';

    for ( i = 0; i < s.length; i++) {
        if (s[i] === s[i + 1]) {
            cnt++;
        } else {
            tmp += cnt === 1 ? s[i] : (s[i] + cnt);
            cnt = 1;
        }
    }
    return tmp;
  }
  
  let str="KKHSSSSSSSE";
  console.log(solution(str));