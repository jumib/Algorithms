function solution(n, arr){
    let answer, max=Number.MIN_SAFE_INTEGER;
    arr.forEach(item => {
      let sum = 0;
      let temp = item;
      while(temp) {
        sum+=(temp % 10);
        temp=Math.floor(temp/10);
      }
      if (sum > max) {
        max=sum;
        answer=item;
      }
      else if (sum === max) {
        if (item > answer) {
          answer = item;
        }
      }
    });
    return answer;
  };
  
  let arr=[128, 460, 603, 40, 521, 137, 123];
  console.log(solution(7, arr));