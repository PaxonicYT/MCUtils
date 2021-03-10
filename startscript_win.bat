:start
java -Xmx1G -jar MinecraftServer.jar
echo "If you want to end the server process completely now, press Ctrl+C before the time has expired!"
timeout 5
goto start