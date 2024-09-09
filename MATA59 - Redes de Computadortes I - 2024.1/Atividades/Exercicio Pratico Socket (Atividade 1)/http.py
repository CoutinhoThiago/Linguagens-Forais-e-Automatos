import socket
from urllib.parse import urlparse

def send_get_request(url):
    parsed_url = urlparse(url)
    host = parsed_url.netloc
    path = parsed_url.path if parsed_url.path else "/"
    
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((host, 80))
        request = f"GET {path} HTTP/1.1\r\nHost: {host}\r\nConnection: close\r\n\r\n"
        s.sendall(request.encode())
        response = b""
        while True:
            data = s.recv(1024)
            if not data:
                break
            response += data

        print(f"HTTP GET {host}")

        decoded_response = response.decode(errors='ignore')
        #print(decoded_response)
        if "HTTP/1.1 200 OK" in decoded_response:
            print("200 OK")
        if "HTTP/1.1 301 Moved Permanently" in decoded_response:
            print("301 Moved Permanently")
        if "HTTP/1.1 302 Found" in decoded_response:
            print("302 Found")
            
        for line in decoded_response.splitlines():
            if ">301 Moved Permanently<" in line or "moved to" in line or "<!doctype html>" in line:
                print(line.strip())

        print()


def main():
    urls = [
        "http://www.globo.com",
        "http://www.msn.com",
        "http://www.google.com.br"
    ]
    
    for url in urls:
        send_get_request(url)

if __name__ == "__main__":
    main()
