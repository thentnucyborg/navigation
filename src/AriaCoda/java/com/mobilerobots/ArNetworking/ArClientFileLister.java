/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArClientFileLister {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArClientFileLister(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArClientFileLister obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArClientFileLister(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArClientFileLister(ArClientBase client) {
    this(ArNetworkingJavaJNI.new_ArClientFileLister(ArClientBase.getCPtr(client), client), true);
  }

  public boolean isAvailable() {
    return ArNetworkingJavaJNI.ArClientFileLister_isAvailable(swigCPtr, this);
  }

  public void changeToTopDir() {
    ArNetworkingJavaJNI.ArClientFileLister_changeToTopDir(swigCPtr, this);
  }

  public void changeToDir(String dir) {
    ArNetworkingJavaJNI.ArClientFileLister_changeToDir(swigCPtr, this, dir);
  }

  public void upOneDir() {
    ArNetworkingJavaJNI.ArClientFileLister_upOneDir(swigCPtr, this);
  }

  public void changeToAbsDir(String dir) {
    ArNetworkingJavaJNI.ArClientFileLister_changeToAbsDir(swigCPtr, this, dir);
  }

  public String getCurrentDir() {
    return ArNetworkingJavaJNI.ArClientFileLister_getCurrentDir(swigCPtr, this);
  }

  public String getWaitingForDir() {
    return ArNetworkingJavaJNI.ArClientFileLister_getWaitingForDir(swigCPtr, this);
  }

  public SWIGTYPE_p_std__listT_ArClientFileListerItem_t getDirectories() {
    return new SWIGTYPE_p_std__listT_ArClientFileListerItem_t(ArNetworkingJavaJNI.ArClientFileLister_getDirectories(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_ArClientFileListerItem_t getFiles() {
    return new SWIGTYPE_p_std__listT_ArClientFileListerItem_t(ArNetworkingJavaJNI.ArClientFileLister_getFiles(swigCPtr, this), true);
  }

  public void addUpdatedCallback(ArFunctor1_Int functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArClientFileLister_addUpdatedCallback__SWIG_0(swigCPtr, this, ArFunctor1_Int.getCPtr(functor), functor, position.swigValue());
  }

  public void addUpdatedCallback(ArFunctor1_Int functor) {
    ArNetworkingJavaJNI.ArClientFileLister_addUpdatedCallback__SWIG_1(swigCPtr, this, ArFunctor1_Int.getCPtr(functor), functor);
  }

  public void remUpdatedCallback(ArFunctor1_Int functor) {
    ArNetworkingJavaJNI.ArClientFileLister_remUpdatedCallback(swigCPtr, this, ArFunctor1_Int.getCPtr(functor), functor);
  }

  public ArTime getLastUpdated() {
    return new ArTime(ArNetworkingJavaJNI.ArClientFileLister_getLastUpdated(swigCPtr, this), true);
  }

  public ArTime getLastRequested() {
    return new ArTime(ArNetworkingJavaJNI.ArClientFileLister_getLastRequested(swigCPtr, this), true);
  }

  public void log(boolean withTimes) {
    ArNetworkingJavaJNI.ArClientFileLister_log(swigCPtr, this, withTimes);
  }

}
