#!/bin/bash
export CC_OPT="'-I$JAVA_HOME/include' '-I$JAVA_HOME/include/win32' -I../mcp2200/libusbx/include"
export SO_EXT=".dll"
export LD_LIBS="../mcp2200/libusbx/MinGW32/dll/libusb-1.0.dll.a"
export LD_OPT="-s -shared -Wl,--kill-at"
make 
cp ../mcp2200/libusbx/MinGW32/dll/libusb-1.0.dll bin-c/