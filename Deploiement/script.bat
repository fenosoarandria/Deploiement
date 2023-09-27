git pull https://github.com/fenosoarandria/Deploiement.git

mkdir WEB-INF
cd ./WEB-INF
mkdir classes

cd ../
javac -d .\WEB-INF\classes\ *.java

jar -cvf ../Myproject.war ./
