
function solution(arr){
    const result = [];
  
    arr.forEach((number) => {
      // 일단 number 를 뒤집는다
      // 맨앞이 0이면 생략 해야됨
      let tmp = Number(String(number).split('').reverse().join(''));
  
      // 이제 tmp가 소수인지 확인한다
      // 소수인지 확인하려면 어떻게해야될까
      // 제일단순한거는 tmp까지 하나하나 나눠보는거..
  
      let isPrime = true;
  
      for (let i = 2; i < tmp; i++) {
        if (tmp % i === 0) {
          // 소수아님
          isPrime = false;
          break;
        }
      }
  
      if (isPrime && tmp !== 1) {
        //1은 빼야됨
        result.push(tmp);
      }
    });
  
    return result;
  }
  
  let arr=[32, 55, 62, 20, 250, 370, 200, 30, 100];
  console.log(solution(arr));