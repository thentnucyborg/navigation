/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_ArNetworkingJava_WRAP_H_
#define SWIG_ArNetworkingJava_WRAP_H_

class SwigDirector_ArFunctor_ServerClient : public ArFunctor1< ArServerClient * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor_ServerClient(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor_ServerClient();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(ArServerClient *p1);
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<4> swig_override;
};

class SwigDirector_ArFunctor_NetPacket : public ArFunctor1< ArNetPacket * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor_NetPacket(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor_NetPacket();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(ArNetPacket *p1);
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<4> swig_override;
};

class SwigDirector_ArFunctor_ServerData : public ArFunctor2< ArServerClient *,ArNetPacket * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor_ServerData(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor_ServerData();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(ArServerClient *p1);
    virtual void invoke(ArServerClient *p1, ArNetPacket *p2);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<5> swig_override;
};


#endif
