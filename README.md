# 자바 문법 정리

## 입출력

### 입력받기 (BufferdReader, StringTokenizer)
```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int[] arr = new int[2];
for(int i=0; i<2; i++) arr[i] = Integer.parseInt(st.nextToken());
```

### 출력하기 (BufferedWriter)
```
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
bw.write(String.valueOf(arr[0] + arr[1]));
bw.flush();
bw.close();
```
