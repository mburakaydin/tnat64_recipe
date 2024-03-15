DESCRIPTION = "TNAT64 is an interceptor which redirects outgoing TCPv4 connections through NAT64, thus enabling an application running on an IPv6-only host to communicate with the IPv4 world, even if that application does not support IPv6 at all."
HOMEPAGE = "https://github.com/andrewshadura/tnat64"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=18810669f13b87348459e611d31ab760"
SECTION = "net"

SRC_URI = "https://github.com/andrewshadura/tnat64/releases/download/${BPN}-${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "ef5543fa2f8b1a4de2c4e347b1849b99"
SRC_URI[sha256sum] = "97f6f36262a9b8b330d0934cda3f156aba4c1fbcffda5dd6b945396b8745501b"

inherit autotools


do_install:append() {
    install -Dm644 ${S}/tnat64.conf.simple.example "${D}${sysconfdir}/tnat64.conf"
}

