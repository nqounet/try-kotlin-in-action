# try-kotlin-in-action
## 基本的な実行方法
- ディレクトリをコンパイル対象にすることで、 import が可能になる

```bash
$ # 各章ごとにディレクトリを作成
$ cd chapter-2.2.3

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
