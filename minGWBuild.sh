#!/bin/bash
export CC="C:\Users\balazs.grill\Downloads\x86_64-4.8.2-release-win32-sjlj-rt_v3-rev2\mingw64\bin\gcc -m64"
export CC_OPT="'-I$JAVA_HOME/include' '-I$JAVA_HOME/include/win32' -I../mcp2200/libusbx/include"
export SO_EXT=".dll"
export LD_LIBS="../mcp2200/libusbx/MinGW64/dll/libusb-1.0.dll.a"
export LD_OPT="-s -shared -Wl,--kill-at"
make 
cp ../mcp2200/libusbx/MinGW32/dll/libusb-1.0.dll bin-c/