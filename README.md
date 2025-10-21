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

### 읽을 줄이 있을 때까지 입력받기
```
Scanner sc = new Scanner(System.in);

while(sc.hasNextLine()) {
  StringTokenizer st = new StringTokenizer(sc.nextLine());
  int a = Integer.parseInt(st.nextToken());
  int b = Integer.parseInt(st.nextToken());
  
  System.out.println(a+b);
}
```

## 타입 변환

### 12345 -> 1+2+3+4+5
```
result += s.charAt(i)-'0';
```

## 배열

### 정렬하기
```
arr[j].compareTo(arr[j+1]) // 사전순으로 arr[j]가 더 크면 (xyz처럼) 양수, 같으면 0, 작으면 음수
Arrays.sort(arr) // 그냥 사전순으로만 정렬된다

// 그래서 사용자 정의 ! => Comparator
// o1 > o2: 양수(o1이 o2 뒤에), o1 == o2: 0, o1 < o2: 음수(o1이 o2 앞에)
Arrays.sort(newArr, new Comparator<String>() {
  public int compare(String o1, String o2) {
    if(o1.length() > o2.length()) return 1;
    else if(o1.length() == o2.length()) return o1.compareTo(o2);
    else return -1;
  }
});
```

### 중복된 값 지우기
- set 사용하기
```
Set<String> stringHashSet = new HashSet<String>();
for(String s : arr) stringHashSet.add(s);

int idx = 0;
n = stringHashSet.size();
String[] newArr = new String[n];

for (String s : stringHashSet) newArr[idx++] = s;
```
