class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a != b) {
			a = (a / 2) + (a % 2); //짝수면 나누기 2, 홀수면 나누기 2 + 1
			b = (b / 2) + (b % 2);
			
			answer++; 
		}

        return answer;
    }
}
