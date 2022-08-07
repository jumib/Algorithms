function solution(arr){  
    let answer=0;
    let x = [-1,0,1,0]; // 행
    let y = [0,1,0,-1]; // 열
    let len = arr.length;
    for(let i=0; i<len; i++){
        for(let j=0; j<len; j++){
            let flag = 1;
            // 봉우리 아닌 경우 거르기
            for(let k=0; k<4; k++){
                let nx = i+x[k];
                let ny = j+y[k];
                // check : 가장자리가 0으로 초기화 + 위치는 length보다 작아야 함 + 봉우리
                if(nx>=0&&ny>=0&&nx<len&&ny<len&&arr[nx][ny]>=arr[i][j]){
                    flag=0;
                    break;
                }
            }
            if(flag){answer++};
        }
    }  
    return answer;
  }
  
  let arr=[[5, 3, 7, 2, 3], 
           [3, 7, 1, 6, 1],
           [7, 2, 5, 3, 4],
           [4, 3, 6, 4, 1],
           [8, 7, 3, 5, 2]];
  console.log(solution(arr));