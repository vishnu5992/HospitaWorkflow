import { TestBed } from '@angular/core/testing';

import { DocserveService } from './docserve.service';

describe('DocserveService', () => {
  let service: DocserveService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DocserveService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
