/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class hu_mcp2200_MCP2200JNI */

#ifndef _Included_hu_mcp2200_MCP2200JNI
#define _Included_hu_mcp2200_MCP2200JNI
#ifdef __cplusplus
extern "C" {
#endif
#undef hu_mcp2200_MCP2200JNI_VENDOR_ID
#define hu_mcp2200_MCP2200JNI_VENDOR_ID 1240L
#undef hu_mcp2200_MCP2200JNI_PRODUCT_ID
#define hu_mcp2200_MCP2200JNI_PRODUCT_ID 223L
/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    init
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_init
  (JNIEnv *, jobject);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    close
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_hu_mcp2200_MCP2200JNI_close
  (JNIEnv *, jobject);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    list_devices
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_list_1devices
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    get_address
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_get_1address
  (JNIEnv *, jobject, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    connect
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_connect
  (JNIEnv *, jobject, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    disconnect
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_hu_mcp2200_MCP2200JNI_disconnect
  (JNIEnv *, jobject, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    hid_set_clear_output
 * Signature: (III)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_hid_1set_1clear_1output
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    hid_configure
 * Signature: (IIIIII)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_hid_1configure
  (JNIEnv *, jobject, jint, jint, jint, jint, jint, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    hid_write_ee
 * Signature: (III)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_hid_1write_1ee
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    hid_read_ee
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_hid_1read_1ee
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    hid_read_io
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_hid_1read_1io
  (JNIEnv *, jobject, jint);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    send
 * Signature: (I[B)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_send
  (JNIEnv *, jobject, jint, jbyteArray);

/*
 * Class:     hu_mcp2200_MCP2200JNI
 * Method:    receive
 * Signature: (I[B)I
 */
JNIEXPORT jint JNICALL Java_hu_mcp2200_MCP2200JNI_receive
  (JNIEnv *, jobject, jint, jbyteArray);

#ifdef __cplusplus
}
#endif
#endif