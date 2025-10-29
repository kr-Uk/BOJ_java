# 자바 문법 정리

<details>
<summary>## 입출력</summary>

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
<\details>

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

## 리스트

### 큐
```
Queue<Integer> q = new LinkedList<Integer>();
q.remove();
q.add(1);
q.element();

Deque<Integer> dq = new ArrayDeque<Integer>();
dq.peek() // 앞에 값 갖고오기
dq.peekLast() // 뒤에 값 갖고오
```

### Collections.sort

- 리스트가 String 타입이면 그냥 따로 override 안해도 돼.
  String 클래스는 Comparable 인터페이스를 사전편찬 순으로 정렬되도록 구현하고 있기 때문임.
  근데 따로 클래스를 만든 오브젝트면?! 구현을 해줘야 알지 !
  그래서 Comparable<>을 implements하고, override로 compareTo 구현.
  
```
int n = Integer.parseInt(br.readLine());
List<Coor> c = new ArrayList<Coor>();

StringTokenizer st;
for (int i=0; i<n; i++) {
  st = new StringTokenizer(br.readLine());
  int x = Integer.parseInt(st.nextToken());
  int y = Integer.parseInt(st.nextToken());
  c.add(new Coor(x, y));
}

Collections.sort(c);

...

class Coor implements Comparable<Coor>{
  int x;
  int y;
  
  public Coor(int x, int y) {
    super();
    this.x = x;
    this.y = y;
  }
  
  public int compareTo(Coor c) {
    if(this.x > c.x ||
    (this.x == c.x && this.y > c.y)) {
      return 1;
    } else return -1;
  }
}
```

- 만약 사용자 정의대로 정렬하고 싶다면?! => Comparator
```
class nameSort implements Comparator<Person>{
  @Override
  public int compare(Person p1, Person p2){
    return p1.name.length() > p2.name.length() ? 1
            : p1.name.length() < p2.name.length() ? -1 : 0;
  }

  Collections.sort(names, new nameSort());
}
```

## Stack
```
Stack<Character> c = new Stack<Character>();
c.push('a');
c.pop();
```

## Set

### 원소가 포함?
```
Set<Integer> s = new HashSet<Integer>();
s.contains(arr[i]);
```

### 교집합, 합집합, 차집합
```
s1.retainAll(s2);
s1.addAll(s2);
s1.removeAll(s2);
```

## 맵
key - value 쌍으로 저장

### HashMap
```
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
if (map.containsKey(temp)) map.replace(temp, map.get(temp)+1);
else map.put(temp, 1);
// replace 대신 그냥 put으로 값을 덮어씌울 수 있다.
```

### TreeMap
key값으로 정렬하려고 사용했음.
```
int n = Integer.parseInt(br.readLine());
Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();

StringTokenizer st;
for (int i=0; i<n; i++) {
  st = new StringTokenizer(br.readLine());
  int key = Integer.parseInt(st.nextToken());
  String value = st.nextToken();
  if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
  map.get(key).add(value);
}

for (Integer key : map.keySet()) {
  for (String s : map.get(key)) {
    bw.write(String.valueOf(key) + " " + s);
    bw.newLine();
  }
}
```





