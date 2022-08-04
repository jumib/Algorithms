function solution(s, t){
    //앞에서 뒤 비교하면서 값  넣어준다.
    //뒤에서 앞으로 값  비교
    let arr = [];
    let cnt = 0;

    for(i=0; i<s.length-1; i++){
        if(s[i] === t){
            cnt = 0;
            arr.push(cnt);
        } else {
            cnt++;
            arr.push(cnt);
        }
    }
    cnt = 0;
    for(i=s.length-1;i>=0;i--){
        if(s[i] === t){
            cnt=0;
            arr[i]=cnt;
        } else {
            cnt++;
            arr[i] = Math.min(arr[i], cnt);
        }
    }
    return arr

}

let str="teachermode";
console.log(solution(str,'e'));