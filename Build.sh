#!/bin/bash
${JAVA_HOME:=/usr/lib/jvm/default-java}
export CC_OPT="'-I$JAVA_HOME/include' '-I$JAVA_HOME/include/linux'"
export SO_EXT=".so"
export LD_LIBS="-lrt -lpthread -ludev -lusb-1.0"
export LD_OPT="-shared"
make 