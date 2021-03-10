#!/bin/sh
while true
do
java -Xmx1G -jar MinecraftServer.jar
echo "If you want to end the server process completely now, press Ctrl+C before the time has expired!"
echo "Restarting in "
for i in 5 4 3 2 1
do
echo "$i secs..."
sleep 1
done
echo "Restarting now!"
done