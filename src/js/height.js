function solution(arr){         
    let answer;
    let tmp;
    answer = 1;
    tmp = arr[0];
    for(let i = 1 ; i < arr.length; i++){
        if(tmp < arr[i]){
            tmp = arr[i]
            answer++;
        } else {
            return answer;
        }
    }
  }
  
  let arr=[130, 135, 148, 140, 145, 150, 150, 153];
  console.log(solution(arr));