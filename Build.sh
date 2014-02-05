#!/bin/bash
export CC_OPT="'-I$JAVA_HOME/include'"
export SO_EXT=".so"
export LD_LIBS="-lrt -lpthread -ludev -lusb-1.0"
export LD_OPT="-shared"
make 