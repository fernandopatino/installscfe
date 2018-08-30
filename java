sudo cp -r jre-8u181-linux-x64.tar.gz /usr/local/java
cd /usr/local/java
sudo tar xvzf jre-8u181-linux-x64.tar.gz



echo "JAVA_HOME=/usr/local/java/jre1.8.0_181" | sudo tee -a /etc/profile
echo "PATH=$PATH:$HOME/bin:$JAVA_HOME/bin"  | sudo tee -a /etc/profile
echo "export JAVA_HOME" | sudo tee -a /etc/profile
echo "export PATH" | sudo tee -a /etc/profile

sudo source  /etc/profile

sudo update-alternatives --install "/usr/bin/java" "java" "/usr/local/java/jre1.8.0_181/bin/java" 1 
sudo update-alternatives --set java /usr/local/java/jre1.8.0_181/bin/java 

