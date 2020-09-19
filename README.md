# try-kotlin-in-action
## 基本的な実行方法

```bash
$ # kolint -F: コードのフォーマット
$ # kotlinc: コードのコンパイル
$ # java: 実行
$ ktlint -F && kotlinc . -include-runtime -d main.jar && java -jar main.jar
```

## 3.4.2

```bash
$ ktlint -F && kotlinc . -include-runtime -d main.jar && java -jar main.jar a b c
[args: , a, b, c]
```
