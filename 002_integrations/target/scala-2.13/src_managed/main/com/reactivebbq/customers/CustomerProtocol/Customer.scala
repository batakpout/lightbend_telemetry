// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.reactivebbq.customers.CustomerProtocol

@SerialVersionUID(0L)
final case class Customer(
    username: _root_.scala.Predef.String = "",
    fullname: _root_.scala.Predef.String = "",
    email: _root_.scala.Predef.String = "",
    phone: _root_.scala.Predef.String = "",
    address: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Customer] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = username
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = fullname
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = email
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = phone
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = address
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = username
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = fullname
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = email
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = phone
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = address
        if (!__v.isEmpty) {
          _output__.writeString(5, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withUsername(__v: _root_.scala.Predef.String): Customer = copy(username = __v)
    def withFullname(__v: _root_.scala.Predef.String): Customer = copy(fullname = __v)
    def withEmail(__v: _root_.scala.Predef.String): Customer = copy(email = __v)
    def withPhone(__v: _root_.scala.Predef.String): Customer = copy(phone = __v)
    def withAddress(__v: _root_.scala.Predef.String): Customer = copy(address = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = username
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = fullname
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = email
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = phone
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = address
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(username)
        case 2 => _root_.scalapb.descriptors.PString(fullname)
        case 3 => _root_.scalapb.descriptors.PString(email)
        case 4 => _root_.scalapb.descriptors.PString(phone)
        case 5 => _root_.scalapb.descriptors.PString(address)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.reactivebbq.customers.CustomerProtocol.Customer
}

object Customer extends scalapb.GeneratedMessageCompanion[com.reactivebbq.customers.CustomerProtocol.Customer] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.reactivebbq.customers.CustomerProtocol.Customer] = this
  def merge(`_message__`: com.reactivebbq.customers.CustomerProtocol.Customer, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.reactivebbq.customers.CustomerProtocol.Customer = {
    var __username = `_message__`.username
    var __fullname = `_message__`.fullname
    var __email = `_message__`.email
    var __phone = `_message__`.phone
    var __address = `_message__`.address
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __username = _input__.readStringRequireUtf8()
        case 18 =>
          __fullname = _input__.readStringRequireUtf8()
        case 26 =>
          __email = _input__.readStringRequireUtf8()
        case 34 =>
          __phone = _input__.readStringRequireUtf8()
        case 42 =>
          __address = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.reactivebbq.customers.CustomerProtocol.Customer(
        username = __username,
        fullname = __fullname,
        email = __email,
        phone = __phone,
        address = __address,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.reactivebbq.customers.CustomerProtocol.Customer] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.reactivebbq.customers.CustomerProtocol.Customer(
        username = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        fullname = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        email = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        phone = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        address = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CustomerProtocolProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CustomerProtocolProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.reactivebbq.customers.CustomerProtocol.Customer(
    username = "",
    fullname = "",
    email = "",
    phone = "",
    address = ""
  )
  implicit class CustomerLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.reactivebbq.customers.CustomerProtocol.Customer]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.reactivebbq.customers.CustomerProtocol.Customer](_l) {
    def username: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.username)((c_, f_) => c_.copy(username = f_))
    def fullname: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.fullname)((c_, f_) => c_.copy(fullname = f_))
    def email: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.email)((c_, f_) => c_.copy(email = f_))
    def phone: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.phone)((c_, f_) => c_.copy(phone = f_))
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.address)((c_, f_) => c_.copy(address = f_))
  }
  final val USERNAME_FIELD_NUMBER = 1
  final val FULLNAME_FIELD_NUMBER = 2
  final val EMAIL_FIELD_NUMBER = 3
  final val PHONE_FIELD_NUMBER = 4
  final val ADDRESS_FIELD_NUMBER = 5
  def of(
    username: _root_.scala.Predef.String,
    fullname: _root_.scala.Predef.String,
    email: _root_.scala.Predef.String,
    phone: _root_.scala.Predef.String,
    address: _root_.scala.Predef.String,
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.reactivebbq.customers.CustomerProtocol.Customer = _root_.com.reactivebbq.customers.CustomerProtocol.Customer(
    username,
    fullname,
    email,
    phone,
    address,
    unknownFields
  )
}
