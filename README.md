Mill project example

Contains a single project `first` with a class and a Specs2 test

Mill documentation http://www.lihaoyi.com/mill/

Useful commands:
Install mill
```
sudo curl -L -o /usr/local/bin/mill https://github.com/lihaoyi/mill/releases/download/0.1.1/0.1.1 && sudo chmod +x /usr/local/bin/mill
```

Gemerate IDEA project
```
mill mill.scalalib.GenIdeaModule/idea
```

Test
```
mill first.test
```


Run
```
mill first.run
```


Show git head commit
```
mill first.gitHead()
```