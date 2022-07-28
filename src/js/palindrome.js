function solution(s){
    let answer="YES";

    let word = s.toLowerCase();
    let len = word.length
    if(len%2 !== 0){
        return 'NO'
    }
    for(i=0; i< Math.floor(len/2); i++){
        if(word[i] !== word[len-1-i]){
            return 'NO'
        }
    }
    return answer;
}

let str="goooG";
console.log(solution(str));