### 1.不论输入的大小写
* 我们可以使用toLowerCase()方法来将 用户输入的选择转换为小写，以便在比较时不区分大小写。
* String userChoice = scanner.nextLine().toLowerCase();

### 2.生成随机数
包括首尾的跨度值+起始值，起始值为0则 不用加
* （1）使用Math.random()方法生成0到1之间的随机double数，然后根据需要进行转换。
* double randomNum = Math.random();
* 0-100
  * int randomNum1 = (int) (Math.random() * 101); // 生成0到100之间的随机整数
* 3-88
  * int randomNum2 = (int) (Math.random() * 86) + 3; // 生成3到88之间的随机整数



* （2）使用Random类生成随机数。可以通过nextInt(), nextDouble(), nextFloat()等方法生成不同类型的随机数。

* **0-99**
  * Random random = new Random();
  * int randomInt = random.nextInt(100); // 生成0到99之间的随机整数
* **1-100**
  * Random random = new Random();
  * int randomNum = random.nextInt(100) + 1; // 生成1到100之间的随机整数
* **3-88**
  * Random random = new Random();
  * int randomNum = random.nextInt(86) + 3; // 生成3到88之间的随机整数
* **0-1**
  * double randomDouble = random.nextDouble(); // 生成0到1之间的随机double数
  

* *（略3）使用ThreadLocalRandom类生成随机数，这是Java 7中引入的线程安全的随机数生成类。*
  * int randomInt = ThreadLocalRandom.current().
  

### 3.与或非
* 与： &
* 或： |
* 非： ！