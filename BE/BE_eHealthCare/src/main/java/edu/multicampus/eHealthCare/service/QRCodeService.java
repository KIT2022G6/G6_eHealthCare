package edu.multicampus.eHealthCare.service;
public interface QRCodeService {

    String decodeQR(byte[] qrCodeBytes);

}